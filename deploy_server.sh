#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

cd $DIR

echo "copying defaultioptions to serverside"
serverConfig="$DIR/src/config/_SERVER"
# do not delete the old server config for now, just overwrite all files
mkdir -p $serverConfig/..
rm -r $serverConfig
cp -rfT "$DIR/src/config/defaultoptions" $serverConfig
rm "$serverConfig/options.txt"
rm "$serverConfig/keybindings.txt"
rm "$serverConfig/servers.dat"

echo "packing server"
java -jar "$DIR/bootstrap-voodoo.jar" pack server "$DIR/cotm.lock.json"
if [ ! $? -eq 0 ]; then
    echo "Error in step: Pack Server"
    exit 1
fi

echo "please upload the server package to your minecraft server"
echo "make sure the minecraft server is stopped"
echo "run the server installer with the install location of your minecraft server"
echo "start the server"

