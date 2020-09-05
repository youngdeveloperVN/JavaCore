package com.vn.manager;

import com.vn.interfaces.GameObjectInterface;
import com.vn.object.GameOjbect;
import com.vn.object.Gun;

public class RenderManager {

	Gun gun1 = new Gun();
	GameOjbect gun2 = new GameOjbect() {
		void getBound() {

		}
	};

	GameObjectInterface gun3 = new GameObjectInterface() {

		@Override
		public void getBound() {
			// TODO Auto-generated method stub

		}

		@Override
		public void render() {
			// TODO Auto-generated method stub

		}
	};

	void renderGame() {
		gun1.render();
		gun3.render();
	}

}
