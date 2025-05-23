#![allow(
    missing_docs,
    trivial_casts,
    unused_variables,
    unused_mut,
    unused_extern_crates,
    non_camel_case_types,
    unused_imports,
    unused_attributes,
)]
#![allow(
    clippy::derive_partial_eq_without_eq,
    clippy::disallowed_names,
    clippy::too_many_arguments
)]

pub const BASE_PATH: &str = "/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63";
pub const API_VERSION: &str = "0.10.1-pre.0";

#[cfg(feature = "server")]
pub mod server;

pub mod models;
pub mod types;
pub mod apis;

#[cfg(feature = "server")]
pub(crate) mod header;
