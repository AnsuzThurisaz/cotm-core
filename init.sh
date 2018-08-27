#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

if [ ! -f bootstrap-voodoo.jar ]; then
  echo downloading voodoo bootstrap
  curl -o bootstrap-voodoo.jar https://ci.elytradev.com/job/elytra/job/Voodoo/job/rewrite/60/artifact/bootstrap/build/libs/bootstrap-voodoo-60.jar
fi

if [ ! -f modpack-creator.jar ]; then
  curl -L -o modpack-creator.jar https://github.com/SKCraft/Launcher/releases/download/creator-2.0.1/modpack-creator-2.0.1.jar
fi
