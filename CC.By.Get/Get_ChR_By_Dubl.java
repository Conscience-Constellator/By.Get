package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Dubl$ChR;

public interface Get_ChR_By_Dubl extends
	Get_Q_By_Dubl,
	Get_ChR_By_Q,
	Dubl$ChR
{
	@Lin_Dclar
	char Get_ChR_By_Dubl(double By);
		@Override @Nevr_Neds_Ovrid
		default char Dubl$ChR(double In)
		{return Get_ChR_By_Dubl(In);}
}