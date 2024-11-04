note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_azure_ip_ranges_service_tags_public_cloud
            -- Get Azure IP Ranges and Service Tags - Public Cloud
            --
            -- Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
        local
            l_response: CHANGE
            l_version: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_version

            -- l_response := api.azure_ip_ranges_service_tags_public_cloud(l_version)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end
