package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$Short;

public interface Get_Short_By_ChR extends
	Get_Q_By_ChR,
	Get_Short_By_Q,
	ChR$Short
{
	@Lin_Dclar
	short Get_Short_By_ChR(char By);
		@Override
		@Nevr_Neds_Ovrid
		default short ChR$Short(char In){return Get_Short_By_ChR(In);}
}