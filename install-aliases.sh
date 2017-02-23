#!/bin/sh

SCRIPT_DIR=$(cd `dirname $0` && pwd)

TARGET_DIR="$HOME/Development/bin"
LINK_NAME="lein-aliases"

if [ -L "$TARGET_DIR/$LINK_NAME" ];
then
    echo "already installed"
    rm -rvi $TARGET_DIR/$LINK_NAME
fi

mkdir -p $TARGET_DIR
cd $TARGET_DIR

ln -s $SCRIPT_DIR/aliases $LINK_NAME
echo "aliases are successfully installed at $TARGET_DIR/$LINK_NAME"
