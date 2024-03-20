# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Azure IP Ranges and Service Tags - Public Cloud 0.9.0-pre.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://download.microsoft.comhttps://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63

### DefaultApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*serviceTagsPublic20240318JsonGet* | *GET* /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*Change* | |
|*Value* | |
|*ValueProperties* | |

