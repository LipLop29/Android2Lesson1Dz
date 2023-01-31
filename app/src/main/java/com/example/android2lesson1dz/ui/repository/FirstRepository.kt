package com.example.android2lesson1dz.ui.repository

import com.example.android2lesson1dz.ui.data.Model

class FirstRepository {
    private var catModelList = mutableListOf<Model>()

    fun getListOfCatHTP(): MutableList<Model> {
        catModelList.clear()
        catModelList.add(Model("https://http.cat/100", "Continue"))
        catModelList.add(Model("https://http.cat/101", "Switching Protocols"))
        catModelList.add(Model("https://http.cat/102", "Processing"))
        catModelList.add(Model("https://http.cat/103", "Early Hints"))
        catModelList.add(Model("https://http.cat/200", "OK"))
        catModelList.add(Model("https://http.cat/201", "Created"))
        catModelList.add(Model("https://http.cat/202", "Accepted"))
        catModelList.add(Model("https://http.cat/203", "Non-Authoritative Information"))
        catModelList.add(Model("https://http.cat/204", "No Content"))
        catModelList.add(Model("https://http.cat/206", "Partial Content"))
        catModelList.add(Model("https://http.cat/207", "Multi-Status"))
        catModelList.add(Model("https://http.cat/300", "Multiple Choices"))
        catModelList.add(Model("https://http.cat/301", "Moved Permanently"))
        catModelList.add(Model("https://http.cat/302", "Found"))
        catModelList.add(Model("https://http.cat/303", "See Other"))
        catModelList.add(Model("https://http.cat/304", "Not Modified"))
        catModelList.add(Model("https://http.cat/305", "Use Proxy"))
        catModelList.add(Model("https://http.cat/307", "Temporary Redirect"))
        catModelList.add(Model("https://http.cat/308", "Permanent Redirect"))
        catModelList.add(Model("https://http.cat/400", "Bad Request"))
        catModelList.add(Model("https://http.cat/401", "Unauthorized"))
        catModelList.add(Model("https://http.cat/402", "Payment Required"))
        catModelList.add(Model("https://http.cat/403", "Forbidden"))
        catModelList.add(Model("https://http.cat/404", "Not Found"))
        catModelList.add(Model("https://http.cat/405", "Method Not Allowed"))
        catModelList.add(Model("https://http.cat/406", "Not Acceptable"))
        catModelList.add(Model("https://http.cat/407", "Proxy Authentication Required"))
        catModelList.add(Model("https://http.cat/408", "Request Timeout"))
        catModelList.add(Model("https://http.cat/409", "Conflict"))
        catModelList.add(Model("https://http.cat/410", "Gone"))
        catModelList.add(Model("https://http.cat/411", "Length Required"))
        catModelList.add(Model("https://http.cat/412", "Precondition Failed"))
        catModelList.add(Model("https://http.cat/413", "Payload Too Large"))
        catModelList.add(Model("https://http.cat/414", "Request-URI Too Long"))
        catModelList.add(Model("https://http.cat/415", "Unsupported Media Type"))
        catModelList.add(Model("https://http.cat/416", "Request Range Satisfiable"))
        catModelList.add(Model("https://http.cat/417", "Expectation Failed"))
        catModelList.add(Model("https://http.cat/418", "I'm a teapot"))
        catModelList.add(Model("https://http.cat/420", "Enhance Your Calm"))
        catModelList.add(Model("https://http.cat/421", "Misdirected Request"))
        catModelList.add(Model("https://http.cat/422", "Unprocessable Entity"))
        catModelList.add(Model("https://http.cat/423", "Locked"))
        catModelList.add(Model("https://http.cat/424", "Failed Dependency"))
        catModelList.add(Model("https://http.cat/425", "Too Early"))
        catModelList.add(Model("https://http.cat/426", "Upgrade Requested"))
        catModelList.add(Model("https://http.cat/429", "Too Many Requested"))
        catModelList.add(Model("https://http.cat/431", "Request Header Fields Too Large"))
        return catModelList
    }
}