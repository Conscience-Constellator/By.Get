package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Short$ChR;

public interface Get_ChR_By_Short extends
	Get_Q_By_Short,
	Get_ChR_By_Q,
	Short$ChR
{
	@Lin_Dclar
	char Get_ChR_By_Short(short By);
		@Override @Nevr_Neds_Ovrid
		default char Short$ChR(short In)
		{return Get_ChR_By_Short(In);}
}