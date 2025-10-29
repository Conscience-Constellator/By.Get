package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$Dubl;

public interface Get_Dubl_By_Byt extends
	Get_Q_By_Byt,
	Get_Dubl_By_Q,
	Byt$Dubl
{
	@Lin_Dclar
	double Get_Dubl_By_Byt(byte By);
		@Override @Nevr_Neds_Ovrid
		default double Byt$Dubl(byte In)
		{return Get_Dubl_By_Byt(In);}
}