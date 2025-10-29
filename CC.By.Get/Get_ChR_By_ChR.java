package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$ChR;

public interface Get_ChR_By_ChR extends
	Get_Q_By_ChR,
	Get_ChR_By_Q,
	ChR$ChR
{
	@Lin_Dclar
	char Get_ChR_By_ChR(char By);
		@Override @Nevr_Neds_Ovrid
		default char ChR$ChR(char In)
		{return Get_ChR_By_ChR(In);}
}