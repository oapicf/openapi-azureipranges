"""Write the version (YYYYMMDD) of the latest Azure IP Ranges and Service Tags -
Public Cloud JSON file, as offered by its Microsoft Download Center details page,
to the file path given as the first argument."""

import re
import sys

from msdlcdetails import get_details

DETAILS_URL = "https://www.microsoft.com/en-us/download/details.aspx?id=56519"
FILE_NAME_PATTERN = re.compile(r"ServiceTags_Public_(\d{8})\.json")

details = get_details(DETAILS_URL)
download_file = details.find_file("ServiceTags_Public_*.json")
match = FILE_NAME_PATTERN.fullmatch(download_file.name) if download_file else None
if not match:
    sys.exit(f"Unable to find a ServiceTags_Public_YYYYMMDD.json file on {DETAILS_URL}")

with open(sys.argv[1], "w", encoding="utf-8") as version_file:
    version_file.write(match.group(1) + "\n")
