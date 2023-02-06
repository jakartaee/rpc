[//]: # " Copyright (c) 2023 Oracle and/or its affiliates. "
[//]: # "  "
[//]: # " This program and the accompanying materials are made available under the "
[//]: # " terms of the Apache Software License v. 2.0 which is available at "
[//]: # " https://spdx.org/licenses/Apache-2.0. "
[//]: # "  "
[//]: # " SPDX-License-Identifier: Apache-2.0  "

---

# Jakarta RPC [![Build Status](https://travis-ci.org/eclipse-ee4j/rpc.svg?branch=main)](https://travis-ci.org/eclipse-ee4j/rpc)

**Jakarta RPC** provides a specification document, TCK and foundational API to develop gRPC services and clients in Java.

The main goal of Jakarta RPC project is to make gRPC easier to use within Jakarta EE ecosystem, by allowing developers to define gRPC services and clients the same way they are defining REST services and clients today -- via annotated classes (a la JAX-RS) on the server, and annotated interfaces (a la Eclipse MicroProfile REST Client) on the client -- and by making them easier to integrate with existing Jakarta EE technologies, such as CDI and Config.

An additional goal is to eliminate the need for special tooling and build-time code generation that favors one serialization format: Protobuf. gRPC was designed to be agnostic to the serialization format, and allows independent configuration of payload marshaller for request and response at the RPC method level, so we see no reason to prefer one serialization format over another and force Protobuf upon everyone.

Finally, we want to make sure that Jakarta RPC implementations work well with modern Java versions and fully support Java Module System.                                                                                                                         

Contributions are welcome, please sign the Eclipse Contributor Agreement before submitting PRs: https://www.eclipse.org/contribute/cla

Project page: https://projects.eclipse.org/projects/ee4j.rpc

Mailing list: https://accounts.eclipse.org/mailing-list/jakartarpc-dev
