package br.inatel.dm110.calc.core;

import br.inatel.dm110.calc.api.CalcService;
import br.inatel.dm110.calc.api.ResultCalc;

public class CalcServiceImpl implements CalcService {

	@Override
	public ResultCalc sum(int first, int last) {
		ResultCalc result = new ResultCalc();
		result.setFirs(first);
		result.setLast(last);
		result.setResult(first+last);
		return result;
	}

	@Override
	public ResultCalc subtract(int first, int last) {
		ResultCalc result = new ResultCalc();
		result.setFirs(first);
		result.setLast(last);
		result.setResult(first-last);
		// TODO Auto-generated method stub
		return result;
	}

}
