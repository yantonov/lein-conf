#!/bin/sh

INSTALL_DIR="$HOME/Development/bin/lein"
LEIN_DIST_URL="https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein"
TARGET_FILENAME="lein"

mkdir -p $INSTALL_DIR
cd $INSTALL_DIR
curl -L -o $TARGET_FILENAME $LEIN_DIST_URL
chmod +x $TARGET_FILENAME
