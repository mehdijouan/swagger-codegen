//
// Dog.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



open class Dog: Animal {

    public var breed: String?


    public init(breed: String?) {
        self.breed = breed
    }

    // Encodable protocol methods

    public override func encode(to encoder: Encoder) throws {

        var container = encoder.container(keyedBy: String.self)

        try container.encodeIfPresent(breed, forKey: "breed")
    }

    // Decodable protocol methods

    public override required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: String.self)

        breed = try container.decodeIfPresent(String.self, forKey: "breed")
    }
}

