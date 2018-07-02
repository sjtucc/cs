# cs-rest安全认证流程

## 介绍

cs-rest安全认证基于jwt权限认证以及数据签名认证


## 安全流程
1.客户端发送请求    
http://172.20.7.100/auth   

2.服务端返回json
```
{
    "randomKey": "flfb3o",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJyYW5kb21LZXkiOiJmbGZiM28iLCJzdWIiOiJhZG1pbiIsImV4cCI6MTUzMTEzNDY2OSwiaWF0IjoxNTMwNTI5ODY5fQ.KSIqsEEEe0jcXSJ9zfokEvFXZ7FvHEOB6qOu7sYzJVb7dxuQIwxX5XUfnfOTEa3zrOaF5ydJg_ks_bcFbOpREQ"
}
```
3.客户端发送业务请求接口   
http://172.20.7.100/hello
```aidl
请求头
{"key":"Authorization","value":"Bearer eyJhbGciOiJIUzUxMiJ9.eyJyYW5kb21LZXkiOiJmbGZiM28iLCJzdWIiOiJhZG1pbiIsImV4cCI6MTUzMTEzNDY2OSwiaWF0IjoxNTMwNTI5ODY5fQ.KSIqsEEEe0jcXSJ9zfokEvFXZ7FvHEOB6qOu7sYzJVb7dxuQIwxX5XUfnfOTEa3zrOaF5ydJg_ks_bcFbOpREQ"}
```
```aidl
请求数据（对payload进行md5加密及加盐签名）
{"object":"eyJhZ2UiOjEyLCJuYW1lIjoiZmZmZiIsInRpcHMiOiJjb2RlIiwidXNlciI6InN0eWxlZmVuZyJ9","sign":"f5d58c5e31640d2dd458e56b3f6455d9"}
```

4.服务端接受请求   
1.权限验证：获取Authorization数据进行jwt token验证是  
2.数据验证：签名验证
