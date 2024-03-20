note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_service_tags_public20240318_json_get
            -- Get Azure IP Ranges and Service Tags - Public Cloud
            --
            -- Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
        local
            l_response: CHANGE
        do
            -- TODO: Initialize required params.

            -- l_response := api.service_tags_public20240318_json_get
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end
