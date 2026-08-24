terraform {
  required_providers {
    example = {
      source = "registry.terraform.io/example/example"
    }
  }
}

provider "example" {
  endpoint = "https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63"
  # api_key  = "your-api-key"
  # token    = "your-bearer-token"
}
