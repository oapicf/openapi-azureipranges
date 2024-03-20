import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.change import Change  # noqa: E501
from openapi_server import util


def service_tags_public20240318_json_get():  # noqa: E501
    """Get Azure IP Ranges and Service Tags - Public Cloud

    Retrieve details about Azure IP Ranges and Service Tags - Public Cloud. # noqa: E501


    :rtype: Union[Change, Tuple[Change, int], Tuple[Change, int, Dict[str, str]]
    """
    return 'do some magic!'
