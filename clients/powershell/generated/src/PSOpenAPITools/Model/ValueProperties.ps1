#
# Azure IP Ranges and Service Tags - Public Cloud
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
# Version: 0.9.0-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER ChangeNumber
The number associated with the change.
.PARAMETER Region
The region associated with the value.
.PARAMETER RegionId
The ID of the region.
.PARAMETER Platform
The platform associated with the value.
.PARAMETER SystemService
The system service associated with the value.
.PARAMETER AddressPrefixes
The address prefixes associated with the value.
.PARAMETER NetworkFeatures
The network features associated with the value.
.OUTPUTS

ValueProperties<PSCustomObject>
#>

function Initialize-ValueProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ChangeNumber},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Region},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${RegionId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Platform},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SystemService},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${AddressPrefixes},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${NetworkFeatures}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ValueProperties' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "changeNumber" = ${ChangeNumber}
            "region" = ${Region}
            "regionId" = ${RegionId}
            "platform" = ${Platform}
            "systemService" = ${SystemService}
            "addressPrefixes" = ${AddressPrefixes}
            "networkFeatures" = ${NetworkFeatures}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ValueProperties<PSCustomObject>

.DESCRIPTION

Convert from JSON to ValueProperties<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ValueProperties<PSCustomObject>
#>
function ConvertFrom-JsonToValueProperties {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ValueProperties' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ValueProperties
        $AllProperties = ("changeNumber", "region", "regionId", "platform", "systemService", "addressPrefixes", "networkFeatures")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "changeNumber"))) { #optional property not found
            $ChangeNumber = $null
        } else {
            $ChangeNumber = $JsonParameters.PSobject.Properties["changeNumber"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "region"))) { #optional property not found
            $Region = $null
        } else {
            $Region = $JsonParameters.PSobject.Properties["region"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "regionId"))) { #optional property not found
            $RegionId = $null
        } else {
            $RegionId = $JsonParameters.PSobject.Properties["regionId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "platform"))) { #optional property not found
            $Platform = $null
        } else {
            $Platform = $JsonParameters.PSobject.Properties["platform"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "systemService"))) { #optional property not found
            $SystemService = $null
        } else {
            $SystemService = $JsonParameters.PSobject.Properties["systemService"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "addressPrefixes"))) { #optional property not found
            $AddressPrefixes = $null
        } else {
            $AddressPrefixes = $JsonParameters.PSobject.Properties["addressPrefixes"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "networkFeatures"))) { #optional property not found
            $NetworkFeatures = $null
        } else {
            $NetworkFeatures = $JsonParameters.PSobject.Properties["networkFeatures"].value
        }

        $PSO = [PSCustomObject]@{
            "changeNumber" = ${ChangeNumber}
            "region" = ${Region}
            "regionId" = ${RegionId}
            "platform" = ${Platform}
            "systemService" = ${SystemService}
            "addressPrefixes" = ${AddressPrefixes}
            "networkFeatures" = ${NetworkFeatures}
        }

        return $PSO
    }

}

