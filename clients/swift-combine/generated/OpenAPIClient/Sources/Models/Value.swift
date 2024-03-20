//
// Value.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct Value: Codable {
    /// The name of the value.
    public var name: String?
    /// The unique identifier of the value.
    public var id: String?
    public var properties: ValueProperties?

    public init(name: String? = nil, id: String? = nil, properties: ValueProperties? = nil) {
        self.name = name
        self.id = id
        self.properties = properties
    }
}
