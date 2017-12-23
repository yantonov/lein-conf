#!/bin/sh

SCRIPT="$(basename "$0")"

if [ "$#" -gt 0 ]; then
    CMD="$1"
else
    CMD="check"
fi

lein cljfmt "${CMD}"

if [ "$#" -eq 0 ]; then
    echo "if you want to apply changes use: ${SCRIPT} fix"
fi
