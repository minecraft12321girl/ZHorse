package com.github.zedd7.zhorse.utils;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;

import com.github.zedd7.zhorse.ZHorse;

public class LocaleValidator extends YamlResourceValidator {
	
	public LocaleValidator(ZHorse zh, FileConfiguration locale, FileConfiguration model, File localeFile, String fileName) {
		super(zh, locale, model, localeFile, fileName);
	}
	
	public boolean validate() {
		return true;
	}

}
