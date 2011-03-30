apibuilder
==========

API Builder is a set of classes designed to facilitate the implementation of a
RESTful API.

Two classes form the heart of API builder:

 * `ApiBuilder`
 
   > This class allows for easy construction of the URL which is to be requested
   > for a call. Despite being a seemingly trivial task, with complicated APIs
   > the number of in-URL arguments and parameters can become quite large.
 
 * `ApiService`
 
   > Implementation of the HTTP client which interfaces with the remote server.
   > 
   > Supports the three most common HTTP methods, `GET`, `POST`, and `DELETE`,
   > as well as any arbitrary methods required by the API.



Usage
=====

Though not marked as abstract, `ApiBuilder` and `ApiService` are meant to be
used as base classes on which implementations can build rather than directly.
This allows for the tailoring of the building process to conform to a specific
remote API.

*TODO*: Example.

For now, see [JakeWharton/pingdom-java][1].


Documentation
-------------

 * Javadocs are available at [jakewharton.github.com/apibuilder/][2].
 * Repository is hosted on [github.com/JakeWharton/apibuilder/][3].



Developed By
============

* Jake Wharton - <jakewharton@gmail.com>


Contributors
------------

The `ApiBuilder` and `ApiService` classes are based on
[nabeelmukhtar's github-java-sdk library][4].



License
=======

    Copyright 2011 Jake Wharton

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.




 [1]: https://github.com/JakeWharton/pingdom-java/
 [2]: http://jakewharton.github.com/apibuilder/
 [3]: https://github.com/JakeWharton/apibuilder/
 [4]: https://github.com/nabeelmukhtar/github-java-sdk
