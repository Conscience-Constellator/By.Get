package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Int$Byt;

public interface Get_Byt_By_Int extends
	Get_Q_By_Int,
	Get_Byt_By_Q,
	Int$Byt
{
	@Lin_Dclar
	byte Get_Byt_By_Int(int By);
		@Override @Nevr_Neds_Ovrid
		default byte Int$Byt(int In)
		{return Get_Byt_By_Int(In);}
}