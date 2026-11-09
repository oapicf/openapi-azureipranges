#!/bin/bash
set -o nounset

cd ../
make build-javascript
cd examples/

export SERVICE_TAGS_VERSION="$(cat ../stage/service-tags-version.txt)"

npm link ../clients/javascript/generated/

node usage-javascript.js
