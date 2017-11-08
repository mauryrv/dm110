package br.inatel.dm110.calc.core;

import br.inatel.dm110.calc.api.CalcService;
import br.inatel.dm110.calc.api.ResultCalc;

public class CalcServiceImpl implements CalcService {

	@Override
	public ResultCalc sum(int first, int second) {
		ResultCalc result = new ResultCalc();
		result.setFirs(first);
		result.setSecond(second);
		result.setResult(first+second);
		return result;
	}

	@Override
	public ResultCalc subtract(int first, int second) {
		ResultCalc result = new ResultCalc();
		result.setFirs(first);
		result.setSecond(second);
		result.setResult(first-second);
		// TODO Auto-generated method stub
		return result;
	}

}
