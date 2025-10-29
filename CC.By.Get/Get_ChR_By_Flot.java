package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Flot$ChR;

public interface Get_ChR_By_Flot extends
	Get_Q_By_Flot,
	Get_ChR_By_Q,
	Flot$ChR
{
	@Lin_Dclar
	char Get_ChR_By_Flot(float By);
		@Override @Nevr_Neds_Ovrid
		default char Flot$ChR(float In)
		{return Get_ChR_By_Flot(In);}
}