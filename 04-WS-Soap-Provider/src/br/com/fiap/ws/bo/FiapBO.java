package br.com.fiap.ws.bo;

import org.apache.axis2.AxisFault;

public class FiapBO {

	public float calcularMedia(float nac, float am, float ps) {
		return nac*0.2f + am*0.3f + ps*0.5f;
	}
	
	public float calcularPs(float nac, float am) {
		return (6 - nac*0.2f - am*0.3f)/0.5f; 
	}
	
	public float calularPsMedia(float nac, float am, float mediaEsperada)
															throws AxisFault {
		float ps = (mediaEsperada  - nac*0.2f - am*0.3f)/0.5f;
		if (ps > 10) {
			throw new AxisFault("Sinto muito");
		}
		return ps;
	}
	
}