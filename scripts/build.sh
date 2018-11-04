#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
pwd
scripts/init.sh

find . -name \*.entry.hjson -type f -delete
./gradlew "cotm" --args "build" -Si
if [ ! $? -eq 0 ]; then
    echo "Error building $pack"
    exit 1
fi