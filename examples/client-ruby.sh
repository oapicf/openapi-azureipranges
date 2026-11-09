#!/bin/bash
set -o nounset

cd ../
make build-ruby
cd examples/

export SERVICE_TAGS_VERSION="$(cat ../stage/service-tags-version.txt)"

ruby usageruby.rb
