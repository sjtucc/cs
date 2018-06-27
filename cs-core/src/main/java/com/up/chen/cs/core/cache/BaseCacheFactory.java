package com.up.chen.cs.core.cache;

/**
* @Description: 缓存工厂基类
* @author chenchen
* @date 2018/6/26 15:32
*/
public abstract class BaseCacheFactory implements ICache {

	@Override
	public <T> T get(String cacheName, Object key, ILoader iLoader) {
		Object data = get(cacheName, key);
		if (data == null) {
			data = iLoader.load();
			put(cacheName, key, data);
		}
		return (T) data;
	}

	@Override
	public <T> T get(String cacheName, Object key, Class<? extends ILoader> iLoaderClass) {
		Object data = get(cacheName, key);
		if (data == null) {
			try {
				ILoader dataLoader = iLoaderClass.newInstance();
				data = dataLoader.load();
				put(cacheName, key, data);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return (T) data;
	}

}
