package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$ChR;

public interface Get_ChR_By_Byt extends
	Get_Q_By_Byt,
	Get_ChR_By_Q,
	Byt$ChR
{
	@Lin_Dclar
	char Get_ChR_By_Byt(byte By);
		@Override @Nevr_Neds_Ovrid
		default char Byt$ChR(byte In)
		{return Get_ChR_By_Byt(In);}
}