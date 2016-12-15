#!/bin/sh

SCRIPT_DIR=$(cd `dirname $0` && pwd)

cd $SCRIPT_DIR

TARGET_DIR="$HOME/.lein/aliases"

mkdir -p $TARGET_DIR

cp aliases/* $TARGET_DIR
