package com.inventory.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEA22Oh8k5dfjLy4OESBaSSx5hGCz8u0H+BLBZ0lxm9ivXKU/mX\r\n" + 
			"8oWp5+0i7qDckJxIk4bdCxPElazYRxR3jpCAbN8j+ZcKhMSuLKQZErClTIfnvfsA\r\n" + 
			"+y2WeyNy0043T1SG9KGEL8Fs9ZcTgp6G4O4mHYq+e7LzxW1avpRlD9TdU4ogRpVV\r\n" + 
			"qW1gxdEM7hgsn5LB02OVxSvmxXJs20JT/ZJPOEniA3AIMsbTY7wP4J890u8jpIpq\r\n" + 
			"N/opBfUI2fCIaO5V0QrQWQPWIJURcIGvJywr6TiFZfZ07JNn5xb59T2TFQGU4QQp\r\n" + 
			"pzQUmIHire1I8F0CsOGOvTCJRHYE/6MJNwP8jQIDAQABAoIBAF01o2STLt2jP9WT\r\n" + 
			"SljjZwkuBPRaT8V9pp/YmohoA0O60c+Dx67eYyWKdsDzz0IRZDRppBhEuczttqXc\r\n" + 
			"aD9F3Ypj86DjLzDhby7AOXbbXh95zlfFANG2uKxwjyR/orgtrXjZ9pNjlqtxGHTy\r\n" + 
			"bVO7Wq5KeEuN6EwE/fzih12GjtIin73zV0AwMCTqMuf1gvp72Ocr4tL4DKPTweGU\r\n" + 
			"ZzcuXx+Ui6iJ+OjkjYRzfVfKk8EO5SdkFnopuvKrLoFuzGLtf3r42Gb/e3fLPLXK\r\n" + 
			"jKTCNblv+pJAtrUW8kzRL7EvqtgxZaGu8yvQRxFM9RRStoUzXJLvBgJXH/8UZoMH\r\n" + 
			"/IfVoYECgYEA9SN/tAaj0kDjfPFeG3FcsHoM5ERlMDCeuY3u9n4tYHF3AJ1oG5mZ\r\n" + 
			"02GU8mRHC721T9qeXhCytAhNeKOKVIygxL2P3lJPI/bzBHsrdqMTR7StVYN2m9rf\r\n" + 
			"fChaoYdgqN3bSCRjbciHXYyCRkVecDhIomsUOt7P/IJ9vXHHEetuaDUCgYEA5RwR\r\n" + 
			"ky/nO25vpFdp1LhkAc02rfuoAjHSSYVjd0ga2BFV6+gYBNgpAYs1em0VRFPLel1P\r\n" + 
			"ZmHAZ3QXbRXggQBc/ZlFABOBS/fGtkRgPQJS+aYquQDPRqVhnv67M1+i6xlunzwN\r\n" + 
			"b9Pnfm8AB8iVODDyMc2VfhNJsLRlToKVLPQcPfkCgYEA0eshO0+IT88DP4YNuWBd\r\n" + 
			"KD6L9ZlgMWEhOvKBFJG+V90yM9OXSDNDl9DzVJJsiHBe6E/k19ZiwWputQUOuxJl\r\n" + 
			"xbQylAZWAQ1C066J7KD/LKNa32ShWBuYz2BbJAGi01iQo/mNL4DN8l0VXgmfMmfw\r\n" + 
			"Qy2A+Fy/LJOuC2F4QC8kr5UCgYALl6P8Aox8oVXcxt9/9+R3gt6lZvpVQhgVyD4E\r\n" + 
			"Jw3UqOvkB9ZPSHCqt1R5YVOWJXdCNb5yu7d0hJc62cSGQnJyEnM/Ub1VDrBrQIJu\r\n" + 
			"E9QG9bVrrvLN7EhINzNZohkoNB04yV0Ur3AjIZKq0idatH9Mrc5Glss/uaD2m/zY\r\n" + 
			"TXGwYQKBgF5La/bX42NidJWvmNFGRWznMSfOIwY2kZjCsSQAq1pD737hGuJkU9Sl\r\n" + 
			"T4EVMfPjxO/GydesK0bmFjgZ1dnyhxi6dMyBDBIvroZfQti3GvP5NqPiyz8A/bY+\r\n" + 
			"Kcal91V2xjt9QVAtvs5z29E2eJcSHEztkry8ObKGXhAoD9EbKUwX\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA22Oh8k5dfjLy4OESBaSS\r\n" + 
			"x5hGCz8u0H+BLBZ0lxm9ivXKU/mX8oWp5+0i7qDckJxIk4bdCxPElazYRxR3jpCA\r\n" + 
			"bN8j+ZcKhMSuLKQZErClTIfnvfsA+y2WeyNy0043T1SG9KGEL8Fs9ZcTgp6G4O4m\r\n" + 
			"HYq+e7LzxW1avpRlD9TdU4ogRpVVqW1gxdEM7hgsn5LB02OVxSvmxXJs20JT/ZJP\r\n" + 
			"OEniA3AIMsbTY7wP4J890u8jpIpqN/opBfUI2fCIaO5V0QrQWQPWIJURcIGvJywr\r\n" + 
			"6TiFZfZ07JNn5xb59T2TFQGU4QQppzQUmIHire1I8F0CsOGOvTCJRHYE/6MJNwP8\r\n" + 
			"jQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----"; 
}

