package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$Long;

public interface Get_Long_By_Byt extends
	Get_Q_By_Byt,
	Get_Long_By_Q,
	Byt$Long
{
	@Lin_Dclar
	long Get_Long_By_Byt(byte By);
		@Override @Nevr_Neds_Ovrid
		default long Byt$Long(byte In)
		{return Get_Long_By_Byt(In);}
}