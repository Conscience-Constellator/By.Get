package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$Flot;

public interface Get_Flot_By_Byt extends
	Get_Q_By_Byt,
	Get_Flot_By_Q,
	Byt$Flot
{
	@Lin_Dclar
	float Get_Flot_By_Byt(byte By);
		@Override @Nevr_Neds_Ovrid
		default float Byt$Flot(byte In)
		{return Get_Flot_By_Byt(In);}
}