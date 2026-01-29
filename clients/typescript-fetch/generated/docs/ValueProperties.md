
# ValueProperties


## Properties

Name | Type
------------ | -------------
`changeNumber` | number
`region` | string
`regionId` | number
`platform` | string
`systemService` | string
`addressPrefixes` | Array&lt;string&gt;
`networkFeatures` | Array&lt;string&gt;

## Example

```typescript
import type { ValueProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "changeNumber": null,
  "region": null,
  "regionId": null,
  "platform": null,
  "systemService": null,
  "addressPrefixes": null,
  "networkFeatures": null,
} satisfies ValueProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ValueProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


