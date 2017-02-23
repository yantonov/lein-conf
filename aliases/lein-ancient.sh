#!/bin/sh

SCRIPT_NAME=`basename $0`

if [ "$1" == "upgrade" ];
then
    lein ancient upgrade :interactive
else
    lein ancient
    echo "if you want to apply changes, use: $SCRIPT_NAME upgrade"
fi
