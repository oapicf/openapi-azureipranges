//
// Change.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct Change: Codable {
    /// The number associated with the change.
    public var changeNumber: Int?
    /// The cloud environment.
    public var cloud: String?
    public var values: [Value]?

    public init(changeNumber: Int? = nil, cloud: String? = nil, values: [Value]? = nil) {
        self.changeNumber = changeNumber
        self.cloud = cloud
        self.values = values
    }
}
