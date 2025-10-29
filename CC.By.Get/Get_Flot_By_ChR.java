package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$Flot;

public interface Get_Flot_By_ChR extends
	Get_Q_By_ChR,
	Get_Flot_By_Q,
	ChR$Flot
{
	@Lin_Dclar
	float Get_Flot_By_ChR(char By);
		@Override @Nevr_Neds_Ovrid
		default float ChR$Flot(char In)
		{return Get_Flot_By_ChR(In);}
}