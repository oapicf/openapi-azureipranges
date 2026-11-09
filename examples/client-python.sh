#!/bin/bash
set -o nounset

cd ../
make build-python
cd examples/

export SERVICE_TAGS_VERSION="$(cat ../stage/service-tags-version.txt)"

. ../clients/python/generated/.venv/bin/activate

python usage_python.py
