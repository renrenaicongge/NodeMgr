package cn.ac.dsp.seams;

import org.springframework.stereotype.Service;

import cn.ac.dsp.seams.domain.DelayConversion;


public interface IDelayConversionService {
	
	public DelayConversion getDelayConversionByDelay(int delay);

}
