def template = """<div class="desc">
            <span>Athletics</span>
            <select class="attribute-select" name="attr_athletics_attribute">
                <option value="@{body}" selected="selected">body</option>
                <option value="@{mind}">mind</option>
                <option value="@{soul}">soul</option>
            </select>
            <button type="roll"
                    value="@{character_name} uses Athletics against DN ?{Target DN? |1|2|3|4|5|6}: [[(@{athletics_attribute}+@{athletics_1}+@{athletics_2}+@{athletics_3})d6>?{Target DN? |1|2|3|4|5|6}]] successes with [[@{athletics_focus_1} + @{athletics_focus_2} + @{athletics_focus_3}]] focus points"
                    name="roll_athletics"></button>
        </div>
        <div class="training">
            <input type="checkbox" name="attr_athletics_1" value="1">
            <input type="checkbox" name="attr_athletics_2" value="1">
            <input type="checkbox" name="attr_athletics_3" value="1">
        </div>
        <div class="focus">
            <input type="checkbox" name="attr_athletics_focus_1" value="1">
            <input type="checkbox" name="attr_athletics_focus_2" value="1">
            <input type="checkbox" name="attr_athletics_focus_3" value="1">
        </div>
        """

def list = ["Arcana",
            "Athletics",
            "Awareness",
            "Ballistic skill",
            "Beast Handling",
            "Channelling",
            "Crafting",
            "Determination",
            "Devotion",
            "Dexterity",
            "Entertain",
            "Fortitude",
            "Guile",
            "Intimidation",
            "Intuition",
            "Lore",
            "Medicine",
            "Might",
            "Nature",
            "Reflexes",
            "Stealth",
            "Survival",
            "Theology",
            "Weapon Skill"]

list.each {
    def temp = template.replace("athletics", "$it".toLowerCase().replace(" ", "_"))
    println(temp.replace("Athletics", "$it"))
}

