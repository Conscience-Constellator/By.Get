package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$Int;

public interface Get_Int_By_Byt extends
	Get_Q_By_Byt,
	Get_Int_By_Q,
	Byt$Int
{
	@Lin_Dclar
	int Get_Int_By_Byt(byte By);
		@Override @Nevr_Neds_Ovrid
		default int Byt$Int(byte In)
		{return Get_Int_By_Byt(In);}
}