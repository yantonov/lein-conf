#!/bin/sh

SCRIPT_DIR=$(cd `dirname $0` && pwd)

lein-kibit.sh
lein-eastwood.sh
lein-dead-code.sh
lein-bikeshed.sh
