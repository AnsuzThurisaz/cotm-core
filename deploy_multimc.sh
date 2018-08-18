#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

cd $DIR

echo "packing mmc instance"
java -jar "$DIR/bootstrap-voodoo.jar" pack mmc "$DIR/cotm.lock.json"
if [ ! $? -eq 0 ]; then
    echo "Error in step: Pack MultiMC"
    exit 1
fi

echo "please upload the mmc package to your web server"
echo "you can provide the url to players"

