#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"


echo updating voodoo bootstrap

curl -o bootstrap-voodoo.jar  https://ci.elytradev.com/job/elytra/job/Voodoo/job/rewrite/lastSuccessfulBuild/artifact/bootstrap/build/libs/bootstrap-voodoo-53.jar

