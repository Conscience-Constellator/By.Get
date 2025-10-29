package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$Long;

public interface Get_Long_By_ChR extends
	Get_Q_By_ChR,
	Get_Long_By_Q,
	ChR$Long
{
	@Lin_Dclar
	long Get_Long_By_ChR(char By);
		@Override @Nevr_Neds_Ovrid
		default long ChR$Long(char In)
		{return Get_Long_By_ChR(In);}
}