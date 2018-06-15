#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

cd $DIR

./build.sh

./tome.sh

./deploy_sk.sh

./deploy_server.sh

./deploy_multimc.sh

./deploy_curse.sh

./changelog.sh
