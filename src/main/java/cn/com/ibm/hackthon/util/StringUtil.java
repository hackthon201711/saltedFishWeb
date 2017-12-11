package cn.com.ibm.hackthon.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import cn.com.ibm.hackthon.dto.ItemRateDTO;

/**
 * This class extends the {@code org.apache.commons.lang3.StringUtils} 
 * and can have some self-define methods
 * @author lizhiwei
 *
 */
public class StringUtil extends StringUtils{
	/**
	 * parse string to ItemRateDTO list
	 * @param str
	 * @return
	 */
	public static List<ItemRateDTO> parseStrToList(String str){
		if(isEmpty(str))return null;
		List<ItemRateDTO> list = new ArrayList<>();
		String pa = "(\\d+),\\s?(\\d+).(\\d+)";
		Pattern pattern = Pattern.compile(pa);
		Matcher ma = pattern.matcher(str);
		while(ma.find()) {
			String[]  strArr = ma.group().split(Constant.SYMBOL_COMMA);
			if(strArr!=null && strArr.length==2) {
				ItemRateDTO irDTO = new ItemRateDTO();
				irDTO.setItemId(StringUtil.trim(strArr[0]));
				irDTO.setRate(StringUtil.trim(strArr[1]));
				list.add(irDTO);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		String str = "[[1, 10.229286], [1, 8.945709], [1, 8.701539], [1, 8.560379], [1, 8.554852]],[[1, 10.229286]]";
		parseStrToList(str).stream().forEach(c->System.out.println(c.getItemId()+"===="+c.getRate()));;
	}
}
