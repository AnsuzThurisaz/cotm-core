#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

cd $DIR

echo "testing with mmc instance"
java -jar "$DIR/bootstrap-voodoo.jar" test mmc "$DIR/cotm.lock.json"
if [ ! $? -eq 0 ]; then
    echo "Error in step: Test MultiMC"
    exit 1
fi
